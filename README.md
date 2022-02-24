### Java EE : Devenez développeur d'applications Web Java

### Section 2 : Comment ça marche

## Serveur et client web
# Architecture client serveur
Cela désigne un mode de communication à-travers un réseau entre plusieurs programmes ou logiciel. L'un qualifier de client qui envoi des requêtes et l'autre qualifier de serveur qui les reçoit et y répond. Le client est celui où est exécuté le logiciel client et de serveur le logiciel serveur.

Quand on parle de réseau souvent on pense au réseau internet. Le client, serveur peuvent être loin de l'autre, mais pas forcément. Ils peuvent être très proche l'un de l'autre dans une même entreprise et même la même machine.

# convention d'un site
Le point d'entrée d'un site internet la home page est souvent index.html

# fonctionnement serveur client
Avec un click droit et sélectionner le code source de la page on peut voir ce qu'elle contient. C'est le contenu renvoyer a mon moteur de recherche par exemple google chrome.

# developer tools
Grâce à la touche F12 vous pouvez voir les requêtes échangées avec le serveur et le résultat qui est retourné dans l'onglet network.
Avec le click droit on peut inspecter la page. C'est-ce qu'on appelle les developers tools. Il s'agit d'un ensemble d'outil très pratique pour le développeur web, on va retrouver très rapidement ce panneau.

# protocole
L'échange entre client et serveur et régit par un protocole qui s'appelle HTTP / HTTPS
HTTP = Hyper Text Transfer Protocol
HTTPS = Hyper Text Transfer Protocol Secure

# fonctionnement d'une machine 
Une machine capable de fournir du contenu web est communément appelé un serveur web. C'est-à-dire qu'elle héberge un serveur web est capable de discuté sur un protocole http.
Une machine peut héberger plusieurs logiciels serveurs de toute nature : un serveur web, un serveur de fichier, serveur DNS, server SSH. une machine peut être à la fois client serveur et peut fournir du contenu à d'autres machines ou récupérer à d'autres machines.

## Le serveur Web Apache
C'est le logiciel le plus utilisé dans le monde. C'est pzs un logiciel c'est une fondation fournit un serveur web qui s'appelle plus précisément Apache HTTP Server ou Apache HTTDP

# concurent
NGINX

# server local
localhost
127.0.0.1
nom physique machine pt : macMacBook-Pro-dray.local

## Ce qu'il faut savoir du protocole HTTP
URL = Unified Resource Locator

# url
l'url se compose du protocole HTTP / HTTPS, etc..
suivie de :// emplacement du serveur que tu veux contacter par défaut on attend une adresse qu'on appelle par défaut IP (Internet Protocol)
suivie d'un : le port que vous voulez exploiter
Le port 80 et le port par défaut des serveurs web

# IP et DNS
L'emplacement du serveur est matérialiser par son IP qui est masquer par un nom de domaine attribuer par cette adresse IP. Lorsque j'entre l'adresse nasa.gov. En réalité mon navigateur va d'abord appelé mon serveur DNS qui va permettre de résoudre se nom de domaine et d'obtenir l'IP réelle de ce nom de domaine que vous voulez contacter.

# méthodes / commandes / verbes / action qui accompage une requête sur une url
- get pour obtenir un résultat
- post pour modifier
- put pour ajouter
- delete pour supprimer
