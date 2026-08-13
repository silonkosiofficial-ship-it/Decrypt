.class public final Lr8/m$a;
.super LF8/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr8/m;->H0(ZZ)LF8/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic k:Lr8/m;


# direct methods
.method constructor <init>(ZZLr8/m;LG8/f;LG8/g;)V
    .locals 7

    iput-object p3, p0, Lr8/m$a;->k:Lr8/m;

    const/4 v3, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LF8/d0;-><init>(ZZZLJ8/o;LF8/g;LF8/h;)V

    return-void
.end method


# virtual methods
.method public f(LJ8/i;LJ8/i;)Z
    .locals 2

    .prologue
    const-string v0, "subType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LF8/E;

    const-string v1, "Failed requirement."

    if-eqz v0, :cond_1

    instance-of v0, p2, LF8/E;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr8/m$a;->k:Lr8/m;

    invoke-static {v0}, Lr8/m;->F0(Lr8/m;)Lx7/p;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
