.class public interface abstract Ld/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/b$b;,
        Ld/b$a;
    }
.end annotation


# static fields
.field public static final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x24

    const/16 v1, 0x2e

    const-string v2, "android$support$customtabs$ICustomTabsService"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ld/b;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract X2(J)Z
.end method

.method public abstract a3(Ld/a;Ljava/lang/String;Landroid/os/Bundle;)I
.end method

.method public abstract n2(Ld/a;)Z
.end method

.method public abstract o5(Ld/a;Landroid/net/Uri;)Z
.end method

.method public abstract s3(Ld/a;Landroid/os/Bundle;)Z
.end method

.method public abstract t3(Ld/a;Landroid/net/Uri;Landroid/os/Bundle;)Z
.end method
