.class final LD/F$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/F$b;->a(Le0/g;)Le0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LD/F$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD/F$b$a;

    invoke-direct {v0}, LD/F$b$a;-><init>()V

    sput-object v0, LD/F$b$a;->D:LD/F$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LD/F;)Ljava/util/Map;
    .locals 0

    .prologue
    invoke-virtual {p2}, LD/F;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LD/F;

    invoke-virtual {p0, p1, p2}, LD/F$b$a;->a(Le0/l;LD/F;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
