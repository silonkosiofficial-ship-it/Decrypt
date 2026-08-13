.class final LS/T$g$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$g;->a(LV/n;I)V
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

    iput-object p1, p0, LS/T$g$a;->D:LS/U;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)V
    .locals 1

    iget-object v0, p0, LS/T$g$a;->D:LS/U;

    invoke-interface {v0, p1}, LS/U;->h(Ljava/lang/Long;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LS/T$g$a;->a(Ljava/lang/Long;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
