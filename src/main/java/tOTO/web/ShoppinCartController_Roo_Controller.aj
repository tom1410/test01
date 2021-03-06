// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package tOTO.web;

import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;
import tOTO.web.ShoppinCartController;
import toto.domain.Account;
import toto.domain.LineItem;
import toto.domain.ShoppinCart;
import toto.domain.WebUser;

privileged aspect ShoppinCartController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String ShoppinCartController.create(@Valid ShoppinCart shoppinCart, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, shoppinCart);
            return "shoppincarts/create";
        }
        uiModel.asMap().clear();
        shoppinCart.persist();
        return "redirect:/shoppincarts/" + encodeUrlPathSegment(shoppinCart.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String ShoppinCartController.createForm(Model uiModel) {
        populateEditForm(uiModel, new ShoppinCart());
        return "shoppincarts/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String ShoppinCartController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("shoppincart", ShoppinCart.findShoppinCart(id));
        uiModel.addAttribute("itemId", id);
        return "shoppincarts/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String ShoppinCartController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("shoppincarts", ShoppinCart.findShoppinCartEntries(firstResult, sizeNo));
            float nrOfPages = (float) ShoppinCart.countShoppinCarts() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("shoppincarts", ShoppinCart.findAllShoppinCarts());
        }
        addDateTimeFormatPatterns(uiModel);
        return "shoppincarts/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String ShoppinCartController.update(@Valid ShoppinCart shoppinCart, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, shoppinCart);
            return "shoppincarts/update";
        }
        uiModel.asMap().clear();
        shoppinCart.merge();
        return "redirect:/shoppincarts/" + encodeUrlPathSegment(shoppinCart.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String ShoppinCartController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, ShoppinCart.findShoppinCart(id));
        return "shoppincarts/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String ShoppinCartController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        ShoppinCart shoppinCart = ShoppinCart.findShoppinCart(id);
        shoppinCart.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/shoppincarts";
    }
    
    void ShoppinCartController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("shoppinCart_creationdate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    void ShoppinCartController.populateEditForm(Model uiModel, ShoppinCart shoppinCart) {
        uiModel.addAttribute("shoppinCart", shoppinCart);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("accounts", Account.findAllAccounts());
        uiModel.addAttribute("lineitems", LineItem.findAllLineItems());
        uiModel.addAttribute("webusers", WebUser.findAllWebUsers());
    }
    
    String ShoppinCartController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
