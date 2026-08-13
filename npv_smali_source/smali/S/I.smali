.class public final LS/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/I;

.field public static b:Lx7/q;

.field public static c:Lx7/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS/I;

    invoke-direct {v0}, LS/I;-><init>()V

    sput-object v0, LS/I;->a:LS/I;

    sget-object v0, LS/I$a;->D:LS/I$a;

    const v1, 0x54f53ce4

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    sput-object v0, LS/I;->b:Lx7/q;

    const v0, -0x464974a5

    sget-object v1, LS/I$b;->D:LS/I$b;

    invoke-static {v0, v2, v1}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    sput-object v0, LS/I;->c:Lx7/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx7/q;
    .locals 1

    sget-object v0, LS/I;->b:Lx7/q;

    return-object v0
.end method

.method public final b()Lx7/q;
    .locals 1

    sget-object v0, LS/I;->c:Lx7/q;

    return-object v0
.end method
