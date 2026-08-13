.class public final LS0/L$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS0/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LS0/L$a;

.field private static final b:LS0/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS0/L$a;

    invoke-direct {v0}, LS0/L$a;-><init>()V

    sput-object v0, LS0/L$a;->a:LS0/L$a;

    new-instance v0, LS0/L$a$a;

    invoke-direct {v0}, LS0/L$a$a;-><init>()V

    sput-object v0, LS0/L$a;->b:LS0/L;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LS0/L;
    .locals 1

    sget-object v0, LS0/L$a;->b:LS0/L;

    return-object v0
.end method
