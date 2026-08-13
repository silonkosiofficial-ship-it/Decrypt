.class Lb8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/b$c;


# static fields
.field public static final a:Lb8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/k;

    invoke-direct {v0}, Lb8/k;-><init>()V

    sput-object v0, Lb8/k;->a:Lb8/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    check-cast p1, LO7/e;

    invoke-static {p1}, Lb8/l;->M(LO7/e;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
