.class public final synthetic LS3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP3/i;


# instance fields
.field public final synthetic a:LQ3/t;


# direct methods
.method public synthetic constructor <init>(LQ3/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS3/b;->a:LQ3/t;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, LS3/e;

    check-cast p2, Ll4/m;

    sget v0, LS3/d;->n:I

    invoke-virtual {p1}, LQ3/c;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, LS3/a;

    iget-object v0, p0, LS3/b;->a:LQ3/t;

    invoke-virtual {p1, v0}, LS3/a;->c2(LQ3/t;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ll4/m;->c(Ljava/lang/Object;)V

    return-void
.end method
