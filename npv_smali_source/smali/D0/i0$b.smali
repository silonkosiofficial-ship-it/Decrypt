.class final LD0/i0$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/i0;-><init>(LD0/k0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/i0;


# direct methods
.method constructor <init>(LD0/i0;)V
    .locals 0

    iput-object p1, p0, LD0/i0$b;->D:LD0/i0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/J;LV/s;)V
    .locals 0

    iget-object p1, p0, LD0/i0$b;->D:LD0/i0;

    invoke-static {p1}, LD0/i0;->b(LD0/i0;)LD0/C;

    move-result-object p1

    invoke-virtual {p1, p2}, LD0/C;->I(LV/s;)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/J;

    check-cast p2, LV/s;

    invoke-virtual {p0, p1, p2}, LD0/i0$b;->a(LF0/J;LV/s;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
