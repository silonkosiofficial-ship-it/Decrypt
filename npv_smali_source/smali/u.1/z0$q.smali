.class final Lu/z0$q;
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
.field public static final D:Lu/z0$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/z0$q;

    invoke-direct {v0}, Lu/z0$q;-><init>()V

    sput-object v0, Lu/z0$q;->D:Lu/z0$q;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)Lu/o;
    .locals 2

    new-instance v0, Lu/o;

    invoke-static {p1, p2}, Ln0/m;->i(J)F

    move-result v1

    invoke-static {p1, p2}, Ln0/m;->g(J)F

    move-result p1

    invoke-direct {v0, v1, p1}, Lu/o;-><init>(FF)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/m;

    invoke-virtual {p1}, Ln0/m;->m()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu/z0$q;->a(J)Lu/o;

    move-result-object p1

    return-object p1
.end method
