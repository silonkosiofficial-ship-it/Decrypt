.class final LS/q1$e$b$a$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1$e$b$a$b;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, LS/q1$e$b$a$b$a;->D:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 2

    const/16 v0, 0xc

    int-to-float v0, v0

    iget v1, p0, LS/q1$e$b$a$b$a;->D:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-static {p1, v0}, LK0/u;->l0(LK0/w;F)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/q1$e$b$a$b$a;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
