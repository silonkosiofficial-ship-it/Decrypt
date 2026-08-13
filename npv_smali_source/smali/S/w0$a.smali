.class final LS/w0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/w0;->a(LA/L;ZLx7/a;Lx7/p;Landroidx/compose/ui/d;ZLx7/p;ZLS/u0;Lz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/s0;


# direct methods
.method constructor <init>(LV/s0;)V
    .locals 0

    iput-object p1, p0, LS/w0$a;->D:LV/s0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object v0, p0, LS/w0$a;->D:LV/s0;

    invoke-static {p1, p2}, LY0/t;->g(J)I

    move-result p1

    invoke-static {v0, p1}, LS/w0;->e(LV/s0;I)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/t;

    invoke-virtual {p1}, LY0/t;->j()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LS/w0$a;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
