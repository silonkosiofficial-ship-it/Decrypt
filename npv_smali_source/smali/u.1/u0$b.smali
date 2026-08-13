.class final Lu/u0$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lu/u0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/u0$b;

    invoke-direct {v0}, Lu/u0$b;-><init>()V

    sput-object v0, Lu/u0$b;->D:Lu/u0$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/g0;)V
    .locals 0

    invoke-virtual {p1}, Lu/g0;->L()V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/g0;

    invoke-virtual {p0, p1}, Lu/u0$b;->a(Lu/g0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
