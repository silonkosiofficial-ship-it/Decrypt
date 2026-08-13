.class final LF0/g$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF0/g$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/g$a$a;

    invoke-direct {v0}, LF0/g$a$a;-><init>()V

    sput-object v0, LF0/g$a$a;->D:LF0/g$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/g;I)V
    .locals 0

    invoke-interface {p1, p2}, LF0/g;->d(I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/g;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF0/g$a$a;->a(LF0/g;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
