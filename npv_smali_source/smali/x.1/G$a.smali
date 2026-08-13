.class final Lx/G$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lx/G$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx/G$a;

    invoke-direct {v0}, Lx/G$a;-><init>()V

    sput-object v0, Lx/G$a;->D:Lx/G$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lx/G$a;->a(F)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
