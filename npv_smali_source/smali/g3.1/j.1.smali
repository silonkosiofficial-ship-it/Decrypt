.class public final Lg3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg3/j$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lg3/j;
    .locals 1

    invoke-static {}, Lg3/j$a;->a()Lg3/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lg3/e;
    .locals 1

    invoke-static {}, Lg3/f;->d()Lg3/e;

    move-result-object v0

    invoke-static {v0}, La3/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg3/e;

    return-object v0
.end method


# virtual methods
.method public b()Lg3/e;
    .locals 1

    invoke-static {}, Lg3/j;->c()Lg3/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg3/j;->b()Lg3/e;

    move-result-object v0

    return-object v0
.end method
