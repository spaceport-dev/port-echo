import spaceport.bridge.Command
import spaceport.computer.alerts.Alert
import spaceport.computer.alerts.results.HttpResult
import spaceport.computer.alerts.results.Result


/**
 *
 *   _              /_
 * _)/)(/(_(-/)()/-/   ECHO, a minimal Spaceport scaffold
 *  /       /    v2
 *
 * Port-Echo is a Spaceport starter kit that provides the basic structure and configuration
 * for building a Spaceport application, with no other assumptions.
 *
 * While this scaffold is the most minimal starting point, if you are a new Spaceport
 * developer you may consider starting with the Mercury or Pioneer scaffolds which build in
 * some basic functionality and structure, with example code to speed up development.
 *
 * See also: https://www.spaceport.com.co/docs/scaffolds#echo
 *
 */
class Echo {


    @Alert('on initialized')
    static _init(Result r) {
        Command.debug('Echo initialized.')
    }


    // A simple HTTP route to the root
    @Alert('on / hit')
    static _root(HttpResult r) {
        r.setStatus(503) // Service (temporarily) unavailable.
    }

    // A simple GET route to the /echo endpoint that returns a JSON response
    @Alert('on /echo GET')
    static _echo(HttpResult r) {
        r.writeToClient(['status': 'RUNNING', 'message': 'Hello, World—from Spaceport!'])
    }


}