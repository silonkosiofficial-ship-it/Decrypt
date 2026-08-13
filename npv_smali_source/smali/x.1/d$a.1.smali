.class final Lx/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/d;->c(Lx/h$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx/d;

.field final synthetic E:Lx/h$a;


# direct methods
.method constructor <init>(Lx/d;Lx/h$a;)V
    .locals 0

    iput-object p1, p0, Lx/d$a;->D:Lx/d;

    iput-object p2, p0, Lx/d$a;->E:Lx/h$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lx/d$a;->D:Lx/d;

    invoke-static {p1}, Lx/d;->a(Lx/d;)LX/b;

    move-result-object p1

    iget-object v0, p0, Lx/d$a;->E:Lx/h$a;

    invoke-virtual {p1, v0}, LX/b;->A(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lx/d$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
