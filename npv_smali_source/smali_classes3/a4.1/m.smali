.class public final synthetic La4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP3/i;


# instance fields
.field public final synthetic a:La4/p;


# direct methods
.method public synthetic constructor <init>(La4/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/m;->a:La4/p;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, La4/m;->a:La4/p;

    check-cast p1, La4/d;

    check-cast p2, Ll4/m;

    invoke-virtual {p1}, LQ3/c;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, La4/g;

    new-instance v1, LH3/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, LH3/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, La4/o;

    invoke-direct {v2, v0, p2}, La4/o;-><init>(La4/p;Ll4/m;)V

    invoke-virtual {p1, v1, v2}, La4/g;->L0(LH3/d;La4/f;)V

    return-void
.end method
