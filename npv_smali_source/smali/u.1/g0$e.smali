.class final Lu/g0$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/g0;-><init>(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/g0;


# direct methods
.method constructor <init>(Lu/g0;)V
    .locals 0

    iput-object p1, p0, Lu/g0$e;->D:Lu/g0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object v0, p0, Lu/g0$e;->D:Lu/g0;

    invoke-static {v0, p1, p2}, Lu/g0;->w(Lu/g0;J)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu/g0$e;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
