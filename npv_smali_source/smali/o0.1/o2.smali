.class public final Lo0/o2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo0/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/o2;

    invoke-direct {v0}, Lo0/o2;-><init>()V

    sput-object v0, Lo0/o2;->a:Lo0/o2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Paint;I)V
    .locals 0

    invoke-static {p2}, Lo0/F;->a(I)Landroid/graphics/BlendMode;

    move-result-object p2

    invoke-static {p1, p2}, Lo0/n2;->a(Landroid/graphics/Paint;Landroid/graphics/BlendMode;)V

    return-void
.end method
