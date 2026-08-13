.class public final Lk8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk8/h$a;
    }
.end annotation


# static fields
.field public static final b:Lk8/h$a;

.field private static final c:Lk8/h;


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk8/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk8/h$a;-><init>(Ly7/k;)V

    sput-object v0, Lk8/h;->b:Lk8/h$a;

    new-instance v0, Lk8/h;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lk8/h;-><init>(Ljava/util/List;)V

    sput-object v0, Lk8/h;->c:Lk8/h;

    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/h;->a:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lk8/h;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic a()Lk8/h;
    .locals 1

    sget-object v0, Lk8/h;->c:Lk8/h;

    return-object v0
.end method
