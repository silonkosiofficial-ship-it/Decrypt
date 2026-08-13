.class final Lu/u0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/u0;->b(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LV/n;I)Lu/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/s0;

.field final synthetic E:Lu/s0;


# direct methods
.method constructor <init>(Lu/s0;Lu/s0;)V
    .locals 0

    iput-object p1, p0, Lu/u0$c;->D:Lu/s0;

    iput-object p2, p0, Lu/u0$c;->E:Lu/s0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 2

    iget-object p1, p0, Lu/u0$c;->D:Lu/s0;

    iget-object v0, p0, Lu/u0$c;->E:Lu/s0;

    invoke-virtual {p1, v0}, Lu/s0;->d(Lu/s0;)Z

    iget-object p1, p0, Lu/u0$c;->D:Lu/s0;

    iget-object v0, p0, Lu/u0$c;->E:Lu/s0;

    new-instance v1, Lu/u0$c$a;

    invoke-direct {v1, p1, v0}, Lu/u0$c$a;-><init>(Lu/s0;Lu/s0;)V

    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Lu/u0$c;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
