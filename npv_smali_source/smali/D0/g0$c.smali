.class final LD0/g0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/g0;->a(LD0/i0;Landroidx/compose/ui/d;Lx7/p;LV/n;II)V
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

    iput-object p1, p0, LD0/g0$c;->D:LD0/i0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LD0/g0$c;->D:LD0/i0;

    invoke-virtual {v0}, LD0/i0;->d()V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD0/g0$c;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
