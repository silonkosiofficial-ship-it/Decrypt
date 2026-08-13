.class final Ll0/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll0/d;->k(Lx7/l;)Ll0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Ll0/d$a;->D:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 1

    iget-object v0, p0, Ll0/d$a;->D:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lq0/c;->l1()V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, Ll0/d$a;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
