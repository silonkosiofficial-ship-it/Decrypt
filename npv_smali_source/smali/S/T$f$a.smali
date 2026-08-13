.class final LS/T$f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$f;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/U;


# direct methods
.method constructor <init>(LS/U;)V
    .locals 0

    iput-object p1, p0, LS/T$f$a;->D:LS/U;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, LS/T$f$a;->D:LS/U;

    invoke-interface {v0, p1}, LS/U;->a(I)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS/Y;

    invoke-virtual {p1}, LS/Y;->i()I

    move-result p1

    invoke-virtual {p0, p1}, LS/T$f$a;->a(I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
