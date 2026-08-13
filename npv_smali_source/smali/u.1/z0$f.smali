.class final Lu/z0$f;
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
.field public static final D:Lu/z0$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/z0$f;

    invoke-direct {v0}, Lu/z0$f;-><init>()V

    sput-object v0, Lu/z0$f;->D:Lu/z0$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/n;)Ljava/lang/Float;
    .locals 0

    invoke-virtual {p1}, Lu/n;->f()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/n;

    invoke-virtual {p0, p1}, Lu/z0$f;->a(Lu/n;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
