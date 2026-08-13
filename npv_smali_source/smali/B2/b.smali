.class public final LB2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB2/b$a;
    }
.end annotation


# static fields
.field private static final a:LB2/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB2/b$a;-><init>(Ly7/k;)V

    sput-object v0, LB2/b;->a:LB2/b$a;

    sget-object v0, LB2/d;->a:LB2/d;

    const-string v1, "sqliteJni"

    invoke-virtual {v0, v1}, LB2/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ly2/b;
    .locals 1

    const-string v0, "fileName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    invoke-virtual {p0, p1, v0}, LB2/b;->b(Ljava/lang/String;I)Ly2/b;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;I)Ly2/b;
    .locals 1

    const-string v0, "fileName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Landroidx/sqlite/driver/bundled/BundledSQLiteDriverKt;->a(Ljava/lang/String;I)J

    move-result-wide p1

    new-instance v0, LB2/a;

    invoke-direct {v0, p1, p2}, LB2/a;-><init>(J)V

    return-object v0
.end method
