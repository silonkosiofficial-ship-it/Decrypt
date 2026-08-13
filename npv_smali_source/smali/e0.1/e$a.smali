.class final Le0/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Le0/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le0/e$a;

    invoke-direct {v0}, Le0/e$a;-><init>()V

    sput-object v0, Le0/e$a;->D:Le0/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;Le0/e;)Ljava/util/Map;
    .locals 0

    invoke-static {p2}, Le0/e;->e(Le0/e;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, Le0/e;

    invoke-virtual {p0, p1, p2}, Le0/e$a;->a(Le0/l;Le0/e;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
