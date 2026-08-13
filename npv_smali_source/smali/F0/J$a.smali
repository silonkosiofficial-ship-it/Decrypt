.class final LF0/J$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF0/J$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/J$a;

    invoke-direct {v0}, LF0/J$a;-><init>()V

    sput-object v0, LF0/J$a;->D:LF0/J$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF0/J;
    .locals 4

    new-instance v0, LF0/J;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, LF0/J;-><init>(ZIILy7/k;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/J$a;->a()LF0/J;

    move-result-object v0

    return-object v0
.end method
