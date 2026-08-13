.class public final LV/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LV/j;

.field public static b:Lx7/p;

.field public static c:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LV/j;

    invoke-direct {v0}, LV/j;-><init>()V

    sput-object v0, LV/j;->a:LV/j;

    sget-object v0, LV/j$a;->D:LV/j$a;

    const v1, 0x38ea4dba

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    sput-object v0, LV/j;->b:Lx7/p;

    const v0, 0x72535ae8

    sget-object v1, LV/j$b;->D:LV/j$b;

    invoke-static {v0, v2, v1}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    sput-object v0, LV/j;->c:Lx7/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx7/p;
    .locals 1

    sget-object v0, LV/j;->b:Lx7/p;

    return-object v0
.end method

.method public final b()Lx7/p;
    .locals 1

    sget-object v0, LV/j;->c:Lx7/p;

    return-object v0
.end method
