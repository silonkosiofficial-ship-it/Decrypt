.class final Lz0/L$b$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz0/L$b;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lz0/L;


# direct methods
.method constructor <init>(Lz0/L;)V
    .locals 0

    iput-object p1, p0, Lz0/L$b$c;->D:Lz0/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object v0, p0, Lz0/L$b$c;->D:Lz0/L;

    invoke-virtual {v0}, Lz0/L;->j()Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, Lz0/L$b$c;->a(Landroid/view/MotionEvent;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
