.class final Lu0/m$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu0/m;-><init>(Lu0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu0/m;


# direct methods
.method constructor <init>(Lu0/m;)V
    .locals 0

    iput-object p1, p0, Lu0/m$a;->D:Lu0/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu0/l;)V
    .locals 0

    iget-object p1, p0, Lu0/m$a;->D:Lu0/m;

    invoke-static {p1}, Lu0/m;->e(Lu0/m;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu0/l;

    invoke-virtual {p0, p1}, Lu0/m$a;->a(Lu0/l;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
