.class public final synthetic Lg3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/M$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:LY2/p;


# direct methods
.method public synthetic constructor <init>(JLY2/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg3/o;->a:J

    iput-object p3, p0, Lg3/o;->b:LY2/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-wide v0, p0, Lg3/o;->a:J

    iget-object v2, p0, Lg3/o;->b:LY2/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lg3/M;->e0(JLY2/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
