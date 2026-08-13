.class final Lx/I$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/I;->h(Lx7/l;Lx7/a;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx/I;

.field final synthetic E:Lx7/l;


# direct methods
.method constructor <init>(Lx/I;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lx/I$d;->D:Lx/I;

    iput-object p2, p0, Lx/I$d;->E:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object p1, p0, Lx/I$d;->D:Lx/I;

    invoke-virtual {p1}, Lx/I;->i()F

    move-result p1

    iget-object p2, p0, Lx/I$d;->D:Lx/I;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lx/I;->j(F)V

    iget-object p2, p0, Lx/I$d;->E:Lx7/l;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lx/I$d;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
