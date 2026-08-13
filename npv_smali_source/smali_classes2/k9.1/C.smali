.class public final Lk9/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/v;


# static fields
.field public static final a:Lk9/C;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk9/C;

    invoke-direct {v0}, Lk9/C;-><init>()V

    sput-object v0, Lk9/C;->a:Lk9/C;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public test(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
