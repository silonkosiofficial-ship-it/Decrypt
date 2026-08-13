.class final Lu/z0$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lu/z0$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/z0$h;

    invoke-direct {v0}, Lu/z0$h;-><init>()V

    sput-object v0, Lu/z0$h;->D:Lu/z0$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/o;)J
    .locals 2

    invoke-virtual {p1}, Lu/o;->f()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p1}, Lu/o;->g()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {v0, p1}, LY0/q;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lu/o;

    invoke-virtual {p0, p1}, Lu/z0$h;->a(Lu/o;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->b(J)LY0/p;

    move-result-object p1

    return-object p1
.end method
