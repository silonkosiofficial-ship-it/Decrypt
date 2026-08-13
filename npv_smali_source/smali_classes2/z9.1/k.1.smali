.class public final Lz9/k;
.super Lz9/l;
.source "SourceFile"


# static fields
.field public static final c:Lz9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz9/k;

    invoke-direct {v0}, Lz9/k;-><init>()V

    sput-object v0, Lz9/k;->c:Lz9/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz9/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final c([C)V
    .locals 1

    const-string v0, "array"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/l;->a([C)V

    return-void
.end method

.method public final d()[C
    .locals 1

    const/16 v0, 0x80

    invoke-super {p0, v0}, Lz9/l;->b(I)[C

    move-result-object v0

    return-object v0
.end method
