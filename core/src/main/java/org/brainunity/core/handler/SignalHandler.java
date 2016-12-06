package org.brainunity.core.handler;

import org.brainunity.core.handler.result.SignalHandlerResult;
import org.brainunity.core.io.Signal;

/**
 * @author pascalstammer
 * @version 06.12.16.
 */
public interface SignalHandler {
    SignalHandlerResult handleSignal( Signal signal );
}
