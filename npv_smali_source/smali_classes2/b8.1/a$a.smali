.class final Lb8/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/a;-><init>(Le8/g;Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/a;


# direct methods
.method constructor <init>(Lb8/a;)V
    .locals 0

    iput-object p1, p0, Lb8/a$a;->D:Lb8/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le8/r;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    const-string v0, "m"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/a$a;->D:Lb8/a;

    invoke-static {v0}, Lb8/a;->g(Lb8/a;)Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Le8/p;->c(Le8/q;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le8/r;

    invoke-virtual {p0, p1}, Lb8/a$a;->a(Le8/r;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
