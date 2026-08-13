.class final Lu/u0$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/u0;->f(Lu/v0;Ljava/lang/String;LV/n;II)Lu/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/s0;


# direct methods
.method constructor <init>(Lu/s0;)V
    .locals 0

    iput-object p1, p0, Lu/u0$g;->D:Lu/s0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 1

    iget-object p1, p0, Lu/u0$g;->D:Lu/s0;

    new-instance v0, Lu/u0$g$a;

    invoke-direct {v0, p1}, Lu/u0$g$a;-><init>(Lu/s0;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Lu/u0$g;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
