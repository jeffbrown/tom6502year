package tom6502year

class DemoController {

    def index() {
        def now = new Date()
        render "The year is ${now.format('yyyy')}"
    }
}
