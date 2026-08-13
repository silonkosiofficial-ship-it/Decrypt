.class final LS/K$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/K;->b(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/w0;


# direct methods
.method constructor <init>(LV/w0;)V
    .locals 0

    iput-object p1, p0, LS/K$e;->D:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 1

    .prologue
    iget-object v0, p0, LS/K$e;->D:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, LS8/r;->s0(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LS/K$e;->D:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0}, LK0/u;->m(LK0/w;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/K$e;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
