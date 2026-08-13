.class final LH/w$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/w;-><init>(LH/D;LV/Q0;Landroidx/compose/ui/platform/s1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;


# direct methods
.method constructor <init>(LH/w;)V
    .locals 0

    iput-object p1, p0, LH/w$a;->D:LH/w;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, LH/w$a;->D:LH/w;

    invoke-static {v0}, LH/w;->a(LH/w;)LH/t;

    move-result-object v0

    invoke-virtual {v0, p1}, LH/t;->d(I)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/r;

    invoke-virtual {p1}, LS0/r;->p()I

    move-result p1

    invoke-virtual {p0, p1}, LH/w$a;->a(I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
