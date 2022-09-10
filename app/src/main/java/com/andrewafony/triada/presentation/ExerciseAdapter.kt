package com.andrewafony.triada.presentation

interface ExerciseAdapter {

    class Exercise : GenericAdapter.Base(
        ExerciseViewHolderFactoryChain(
            ViewHolderFactoryChain.Exception()
        )
    )
}