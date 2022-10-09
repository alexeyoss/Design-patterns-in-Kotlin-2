package Behavioural

sealed class State {
    object LoadingState : State(){
        // we can have determinate the behaviour in different States
    }
    object SuccessState : State()
    object ErrorState : State()
}

