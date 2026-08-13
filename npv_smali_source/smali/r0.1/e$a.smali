.class public final Lr0/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lr0/e$a;

.field private static final b:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr0/e$a;

    invoke-direct {v0}, Lr0/e$a;-><init>()V

    sput-object v0, Lr0/e$a;->a:Lr0/e$a;

    sget-object v0, Lr0/e$a$a;->D:Lr0/e$a$a;

    sput-object v0, Lr0/e$a;->b:Lx7/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx7/l;
    .locals 1

    sget-object v0, Lr0/e$a;->b:Lx7/l;

    return-object v0
.end method
