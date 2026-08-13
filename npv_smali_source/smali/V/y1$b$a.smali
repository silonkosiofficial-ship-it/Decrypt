.class final LV/y1$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/y1$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lr/L;


# direct methods
.method constructor <init>(Lr/L;)V
    .locals 0

    iput-object p1, p0, LV/y1$b$a;->D:Lr/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    instance-of v0, p1, Lf0/z;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf0/z;

    const/4 v1, 0x4

    invoke-static {v1}, Lf0/g;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lf0/z;->r(I)V

    :cond_0
    iget-object v0, p0, LV/y1$b$a;->D:Lr/L;

    invoke-virtual {v0, p1}, Lr/L;->h(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LV/y1$b$a;->a(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
