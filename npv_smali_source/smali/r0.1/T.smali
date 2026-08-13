.class public final Lr0/T;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr0/T;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr0/T;

    invoke-direct {v0}, Lr0/T;-><init>()V

    sput-object v0, Lr0/T;->a:Lr0/T;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/RenderNode;Lo0/Z1;)V
    .locals 0

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lr0/O;->a(Landroid/graphics/RenderNode;Landroid/graphics/RenderEffect;)Z

    return-void
.end method
