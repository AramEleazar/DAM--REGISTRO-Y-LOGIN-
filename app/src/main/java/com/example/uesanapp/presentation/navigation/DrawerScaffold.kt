/*package com.example.uesanapp.presentation.navigation

import android.widget.Space
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DrawerScaffold(navController: NavController,
                   content: @Composable () -> Unit){
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Space(modifier = Modifier.height(12.dp))
                Text("Menu Principal", modifier = Modifier.padding(16.dp))

                NavigationDrawerItem(
                    label = { Text("Home") },
                    selected = false,
                    onClick = {
                        navController.navigate("home")
                    }


                    ){}

                NavigationDrawerItem(
                    label = { Text("Favorites") },
                    selected = false,
                    onClick = {
                        navController.navigate("favorites")
                    }


                ){}

                NavigationDrawerItem(
                    label = { Text("Permission") },
                    selected = false,
                    onClick = {
                        navController.navigate("permission")
                    }


                ){}

            }
            )
            ){}


package com.example.uesanapp.presentation.navigation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DrawerScaffold(
    navController: NavController,
    content: @Composable () -> Unit
) {

    val drawerState = rememberDrawerState(DrawerValue.Closed)

    ModalNavigationDrawer(
        drawerState = drawerState,

        drawerContent = {

            ModalDrawerSheet {

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Menu Principal",
                    modifier = Modifier.padding(16.dp)
                )

                NavigationDrawerItem(
                    label = { Text("Home") },
                    selected = false,
                    onClick = {
                        navController.navigate("home")
                    }
                )

                NavigationDrawerItem(
                    label = { Text("Favorites") },
                    selected = false,
                    onClick = {
                        navController.navigate("favorites")
                    }
                )

                NavigationDrawerItem(
                    label = { Text("Permission") },
                    selected = false,
                    onClick = {
                        navController.navigate("permission")
                    }
                )
            }
        }
    ) {

        Scaffold(
            topBar = {
                TopAppBar(
                    tittle = { Text("Uesan App")},
                    navigationIcon = {
                        IconButton(
                            onClick = {
                                scope.launch {
                                    drawerState.open()
                            }
            }
        ) {
             Icon(Icon.default.menu, contentDescription = "Menu")
                        }

    }
}*/

package com.example.uesanapp.presentation.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerScaffold(
    navController: NavController,
    content: @Composable () -> Unit
) {

    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,

        drawerContent = {

            ModalDrawerSheet {

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Menu Principal",
                    modifier = Modifier.padding(16.dp)
                )

                NavigationDrawerItem(
                    label = { Text("Home") },
                    selected = false,
                    onClick = {
                        navController.navigate("home")
                    }
                )

                NavigationDrawerItem(
                    label = { Text("Favorites") },
                    selected = false,
                    onClick = {
                        navController.navigate("favorites")
                    }
                )

                NavigationDrawerItem(
                    label = { Text("Permission") },
                    selected = false,
                    onClick = {
                        navController.navigate("permission")
                    }
                )
            }
        }
    ) {

        Scaffold(

            topBar = {

                TopAppBar(

                    title = {
                        Text("Uesan App")
                    },

                    navigationIcon = {

                        IconButton(

                            onClick = {

                                scope.launch {
                                    drawerState.open()
                                }
                            }

                        ) {

                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Menu"
                            )
                        }
                    }
                )
            }

        ) { paddingValues ->

            Box(modifier = Modifier.padding(paddingValues)){
                content()
            }


        }
    }
}