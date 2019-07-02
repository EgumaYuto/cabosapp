package io.cabos.app.web.signin;

import io.cabos.app.web.base.CabosappBaseAction;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

/**
 * @author masaki.kamachi
 * @author jflute
 */
public class SigninReminderAction extends CabosappBaseAction {

    // #pending now making...
    @Execute
    public HtmlResponse index() {
        return asHtml(path_Signin_SigninReminderHtml);
    }
}
