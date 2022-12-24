listView('hello-view') {
    jobs {
        name('hello-job')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
