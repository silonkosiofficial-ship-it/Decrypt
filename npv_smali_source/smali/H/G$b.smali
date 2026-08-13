.class final LH/G$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LH/G$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/G$b;

    invoke-direct {v0}, LH/G$b;-><init>()V

    sput-object v0, LH/G$b;->D:LH/G$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/W$b;)V
    .locals 2

    const/16 v0, 0x3e8

    invoke-virtual {p1, v0}, Lu/X;->d(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lu/W$b;->f(Ljava/lang/Object;I)Lu/W$a;

    const/16 v1, 0x1f3

    invoke-virtual {p1, v0, v1}, Lu/W$b;->f(Ljava/lang/Object;I)Lu/W$a;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1}, Lu/W$b;->f(Ljava/lang/Object;I)Lu/W$a;

    const/16 v1, 0x3e7

    invoke-virtual {p1, v0, v1}, Lu/W$b;->f(Ljava/lang/Object;I)Lu/W$a;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/W$b;

    invoke-virtual {p0, p1}, LH/G$b;->a(Lu/W$b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
